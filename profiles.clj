{:shared {:clean-targets ["out" :target-path]}

 :dev [:shared
       {:resources-paths ["dev-resources"]
        :source-paths ["dev-resources/tools/http" "dev-resources/tools/repl"]
        :dependencies [[ring "1.2.1"]
                       [compojure "1.1.6"]
                       [hickory "0.5.3"]]
        :plugins [[com.cemerick/austin "0.1.4"]]
        :cljsbuild
        {:builds {:cljs-template
                  {:source-paths ["dev-resources/tools/repl"]
                   :compiler
                   {:optimizations :whitespace
                    :source-map "dev-resources/public/js/cljs_template_map.js"
                    :pretty-print true}}}}

        :injections [(require '[ring.server :as http :refer [run]]
                              'cemerick.austin.repls)
                     (defn browser-repl-env []
                       (reset! cemerick.austin.repls/browser-repl-env
                                (cemerick.austin/repl-env)))
                     (defn browser-repl []
                       (cemerick.austin.repls/cljs-repl
                         (browser-repl-env)))]}]}
