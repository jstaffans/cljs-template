(defproject api-doc "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}

  :min-lein-version "2.4.3"

  :source-paths ["src/clj" "src/cljs"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2227"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [om "0.7.1"]
                 [sablono "0.2.21"]]
  
  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :cljsbuild
  {:builds {:cljs-template
            {:source-paths ["src/cljs"]
             :compiler
             {:output-to "dev-resources/public/js/cljs_template.js"
              :output-dir "dev-resources/public/js/out"
              :optimizations :advanced
              :pretty-print false}}}})
