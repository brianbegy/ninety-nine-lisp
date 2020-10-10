(ns ninety-nine-lisp.core
  (:require [clojure.string :as str]))

(defn p01 "find the last box of a list" [my-list]
  (str/upper-case (last my-list)))

(defn p02 "Find the last but one box of a list." [my-list]
  (map str/upper-case (take-last 2 my-list)))

(defn p03 "Find the K'th element of a list." [my-list index]
  (str/upper-case (nth my-list index)))

(defn p04 "Find the number of elements in a list." [my-list]
  (count my-list))

(defn p05 "reverse a list." [my-list]
  (reduce conj '() my-list))

(defn p06 "is palindrome." [input]
  (cond
    (= 1 (count input)) true
    (= 2 (count input)) (= (first input) (last input))
    :else
    (if (= (first input) (last input))
      (p06 (drop-last (rest input)))
      false)))

(defn flatten-element [ele]
  (if (seq? ele)
    (mapcat flatten-element  ele)
    (list ele)))

(defn p07 "flatten list." [input]
  ; the easy way
  ;(flatten input)
  ; a harder way
  (reduce conj (flatten-element input) []))

(defn append-if-not-duplicate
  "if value != (last coll) append and return, otherwise return coll"
  [coll, value]
  (if (not= (last coll) value)
    (conj coll value)
    coll))

(defn p08 "eliminate consecutive duplicates" [input]
  (reduce append-if-not-duplicate [] input))