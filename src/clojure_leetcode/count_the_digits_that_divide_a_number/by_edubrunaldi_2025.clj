;; https://leetcode.com/problems/count-the-digits-that-divide-a-number/
(ns clojure-leetcode.count-the-digits-that-divide-a-number.by-edubrunaldi-2025)

(defn split-digits
  [num]
  (map Integer/parseInt (map str (str num))))

(defn count-digits
  [num]
  (->> (split-digits num)
       (map #(mod num %))
       (filter zero?)
       (count)))

;; tests

(assert (= 1 (count-digits 7)))
(assert (= 2 (count-digits 121)))
(assert (= 4 (count-digits 1248)))