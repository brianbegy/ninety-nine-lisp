(ns ninety-nine-lisp.core-test
  (:require [clojure.test :refer :all]
            [ninety-nine-lisp.core :refer :all]))

(deftest p01-test-01
  (testing "gets d"
    (is  (= (p01 '("a" "b" "c" "d")) "D"))))

(deftest p02-test-01
  (testing "gets c d "
    (print     (p02 '("a" "b" "c" "d")))
    (is  (= (p02 '("a" "b" "c" "d")) '("C" "D")))))