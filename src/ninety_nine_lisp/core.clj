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
  (reduce conj '() my-list)
)

(defn p06 "is palindrome." [sample]
  (cond 
  (= 1 (count sample)) true
  (= 2 (count sample)) (= (first sample)(last sample))
  :else
  (if (= (first sample)(last sample)) 
    (p06 (drop-last (rest sample)))
    false)
  ))
    