(ns myapp.mycomponent.core
  (:require
   [clojure.test :refer [deftest is]]))

(defn foo [] 3)

(deftest failing-in-component
  (is (= (foo) 2)))
