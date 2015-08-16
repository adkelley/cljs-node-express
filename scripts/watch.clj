(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'pow.core
   :output-to "out/server/pow.js"
   :output-dir "out/server"
   :optimizations :simple
   :target :nodejs
   :cache-analysis true
   :source-map "out/server/pow.js.map"
   :verbose true})
   })
