(ns cljs-template.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [sablono.core :as html :refer-macros [html]]))

(enable-console-print!)

(def app-state (atom {:text "Hello world!"}))

(defn widget [data]
  (om/component
    (html [:div (:text data)
           [:ul (for [n (range 1 10)]
                  [:li n])]
           (html/submit-button "Yo!")])))

(om/root
  widget
  app-state
  {:target (. js/document (getElementById "app"))})


