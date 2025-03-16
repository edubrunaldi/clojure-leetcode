;; https://leetcode.com/problems/maximum-number-of-words-found-in-sentences
(ns clojure-leetcode.maximum-number-of-words-found-in-sentences.by-edubrunaldi-2025)
(require '[clojure.string :as str])

(defn most-words-found
  [texts]
  (->> (map #(str/split % #" ") texts)
       (map count)
       (apply max)))

;; tests

(assert (= 6 (most-words-found ["alice and bob love leetcode", "i think so too", "this is great thanks very much"])))
(assert (= 3 (most-words-found ["please wait", "continue to fight", "continue to win"])))