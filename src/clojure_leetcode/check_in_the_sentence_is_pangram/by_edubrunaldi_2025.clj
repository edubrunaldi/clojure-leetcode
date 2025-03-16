;; https://leetcode.com/problems/check-if-the-sentence-is-pangram
(ns clojure-leetcode.check-in-the-sentence-is-pangram.by-edubrunaldi-2025)
(def alphabet-size 26)

(defn check-if-pangram
  [text]
  (= alphabet-size (count (set text))))

;; tests
(assert (= true (check-if-pangram "thequickbrownfoxjumpsoverthelazydog")))
(assert (= true (check-if-pangram "qwertyuiopasdfghjklzxcvbnm")))
(assert (= false (check-if-pangram "thequickbrownfoxjumpsoverthelazydo")))
(assert (= false (check-if-pangram "leetcode")))