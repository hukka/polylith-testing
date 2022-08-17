(ns myapp.mycomponent-test
  (:require
   [mycomponent.core :as core]
   [clojure.test :refer [deftest is]]))

(deftest failing-out-component
  (is (= (core/foo) 2)))
