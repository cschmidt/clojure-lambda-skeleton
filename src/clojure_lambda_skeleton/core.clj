(ns clojure-lambda-skeleton.core
  (:import [com.amazonaws.services.lambda.runtime Context RequestHandler]
           [java.io InputStream OutputStream])
  (:gen-class :implements [com.amazonaws.services.lambda.runtime.RequestHandler]
              :name ClojureRequestHandler
              :main false
              :methods [[handleRequest [java.io.InputStream
                                        java.io.OutputStream
                                        com.amazonaws.services.lambda.runtime.Context] void]]
              ))

(defn -handleRequest [this ^InputStream input ^OutputStream output ^Context context]
  (let [logger (.getLogger context)]
    (.log logger "Hey there!")))

