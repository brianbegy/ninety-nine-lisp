(ns ninety-nine-lisp.core
  (:require [clojure.string :as str]))

(defn p01 "find the last box of a list" [list]
  (str/upper-case (last list)))

(defn p02 "Find the last but one box of a list." [list]
  (map str/upper-case (take-last 2 list)))