(ns hello.core
  (:require [io.pedestal.http :as http]
            [io.pedestal.http.route :as route]))

(defn respond-hello-world [request]
  {:status 200 :body "Hello World."})

(def routes
  (route/expand-routes
   #{["/hello" :get respond-hello-world :route-name :hello]}))

(defn create-server []
  (http/create-server
   {::http/routes routes
    ::http/type :jetty
    ::http/port 8890}))

(defn start[]
  (http/start (create-server)))