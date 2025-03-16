;; https://leetcode.com/problems/first-unique-character-in-a-string
(ns clojure-leetcode.first-unique-character-in-a-string.by-edubrunaldi-2025)

(defn first-no-duplicates
  [elem-index]
  (->> (mapv vec (group-by :elem elem-index))
       (mapv second)
       (filter #(= (count %) 1))
       (sort-by :idex)
       (first)
       (first)))

(defn first-index-uniq-char
  [text]
  (->> (map-indexed (fn [idx elem] {:idex idx :elem elem}) text)
       (first-no-duplicates)
       (:idex)))
(defn first-uniq-char
  [text]
  (let [char-index (first-index-uniq-char text)]
    (if (nil? char-index)
      -1
      char-index)))

; tests
(assert (= 0 (first-uniq-char "leet")))
(assert (= 2 (first-uniq-char "loveleetcode")))
(assert (= -1 (first-uniq-char "aabb")))
