(ns clojure-lambda-skeleton.core
  (:import [com.amazonaws.services.lambda.runtime Context RequestHandler]
           [java.io InputStream OutputStream])
  (:require [cheshire.core :refer [generate-string parse-stream]]
            [clojure.java.io :refer [reader]])
  (:gen-class :implements [com.amazonaws.services.lambda.runtime.RequestHandler]
              :name ClojureRequestHandler
              :main false
              :methods [[handleRequest [java.io.InputStream
                                        java.io.OutputStream
                                        com.amazonaws.services.lambda.runtime.Context] void]]))

(defn query-param [request param-name]
  (get-in request ["queryStringParameters" param-name]))

(defn -handleRequest [this ^InputStream input ^OutputStream output ^Context context]
  (let [logger (.getLogger context)
        request (parse-stream (reader input))]
    (.log logger (str "request: " (generate-string request)))
    (.log logger "MOAR LOGGING!!")
    (.log logger (str "a=" (query-param request "a")))))

