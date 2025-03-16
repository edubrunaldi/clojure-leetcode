;; https://leetcode.com/problems/minimum-number-game/
(ns clojure-leetcode.minimum-number-game.by-edubrunaldi-2025)

(defn split-in-pairs
  [coll]
  (loop [remeaning-coll coll
         pairs []]
    (if(empty? remeaning-coll)
      pairs
      (let [[item1 item2 & remeaning] remeaning-coll]
        (recur remeaning
               (conj pairs [item1 item2]))))))
(defn number-game
  [nums]
  (->> (sort nums)
       (split-in-pairs)
       (map reverse)
       (flatten)
       (vec)))


;; test

(assert (= [3 2 5 4] (number-game [5 4 2 3])))
(assert (= [5 2] (number-game [2 5])))