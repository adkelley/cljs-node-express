(ns pow.core
  (:require [cljs.nodejs :as nodejs]))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(nodejs/enable-util-print!)

(def express (nodejs/require "express"))

(defn say-hello! [req res]
  (.send res "Hello World"))

(defn hello-node [req res]
  (.send res "NodeJS is working in ClojureScript"))

(defn page-not-found [req res]
  (.send res "Page not found"))

(defn -main []
  (let [app (express)]
    (.get app "/" say-hello!)
    (.get app "/node" hello-node)
    (.get app "" page-not-found)
    (.listen app 3000 (fn []
                        (println "Server started on port 3000")))))

(set! *main-cli-fn* -main)

