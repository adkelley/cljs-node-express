(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:main 'pow.core
     :output-to "out/server/pow.js"
     :output-dir "out/server"
     :optimizations :simple
     :target :nodejs
     :cache-analysis true
     :source-map "out/server/pow.js.map"
     :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))


