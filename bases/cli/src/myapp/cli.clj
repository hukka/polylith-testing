(ns myapp.cli
  (:require
   [myapp.mycomponent.interface :as mycomponent]
   [clojure.test :refer [deftest is]]))

(defn bar []
  (mycomponent/foo))

(defn -main [& args]
  (bar))

(deftest failing-in-base
  (is (= (bar) 2)))
