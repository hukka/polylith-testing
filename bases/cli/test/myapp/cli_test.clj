(ns myapp.cli-test
  (:require
   [clojure.test :refer [deftest is]]))

(deftest failing-out-base
  (is (= 1 2)))
