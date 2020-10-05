(ns ninety-nine-lisp.core-test
  (:require [clojure.test :refer :all]
            [ninety-nine-lisp.core :refer :all]))

(deftest p01-test-01
  (testing "gets d"
    (is  (= (p01 '("a" "b" "c" "d")) "D"))))

(deftest p02-test-01
  (testing "gets c d "
    (is  (= (p02 '("a" "b" "c" "d")) '("C" "D")))))

(deftest p03-test-01
  (testing "gets C "
    (is  (= (p03  '("a" "b" "c" "d" "e") 2) "C"))))

(deftest p04-test-01
  (testing "gets 5 "
    (is  (= (p04  '("a" "b" "c" "d" "e")) 5))))

(deftest p05-test-01
  (testing "gets reversed"
    (is  (= (p05  '("a" "b" "c" "d" "e")) '("e" "d" "c" "b" "a")))))

(deftest p06-test-01
  (testing "is palindrome"
  (are [result input] (= result (p06 input))
     true  "abbba"
     true  "abbbbba"
     false  "abbbaa"
     false  "derabbba"
    )))