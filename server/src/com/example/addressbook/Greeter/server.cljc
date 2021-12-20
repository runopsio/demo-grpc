;;;----------------------------------------------------------------------------------
;;; Generated by protoc-gen-clojure.  DO NOT EDIT
;;;
;;; GRPC com.example.addressbook.Greeter Service Implementation
;;;----------------------------------------------------------------------------------
(ns com.example.addressbook.Greeter.server
  (:require [com.example.addressbook :refer :all]
))

;-----------------------------------------------------------------------------
; GRPC Greeter
;-----------------------------------------------------------------------------
(defprotocol Service
  (Hello [this param])
  (SayRepeatHello [this param]))

(defn- Hello-dispatch
  [ctx request]
  (Hello ctx request))
(defn- SayRepeatHello-dispatch
  [ctx request]
  (SayRepeatHello ctx request))

(def ^:const rpc-metadata
  [{:pkg "com.example.addressbook" :service "Greeter" :method "Hello" :method-fn Hello-dispatch :server-streaming false :client-streaming false :input pb->Person :output new-HelloResponse}
   {:pkg "com.example.addressbook" :service "Greeter" :method "SayRepeatHello" :method-fn SayRepeatHello-dispatch :server-streaming true :client-streaming true :input pb->Person :output new-HelloResponse}])