;; https://leetcode.com/problems/add-digits
(ns clojure-leetcode.add-digits.by-edubrunaldi-2025)

(defn one-digit?
  [num]
  (= (count (str num)) 1))

(defn digits-sum
  [num]
  (reduce + (map Integer/parseInt (mapv str (str num)))))

(defn add-digits
  [num]
  (if (one-digit? num)
    num
    (recur (digits-sum num))))

; tests
(assert (= 2 (add-digits 38)))
(assert (= 0 (add-digits 0)))
(assert (= 9 (add-digits 9)))
(assert (= 7 (add-digits 1289347)))