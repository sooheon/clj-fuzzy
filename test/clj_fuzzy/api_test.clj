;; -------------------------------------------------------------------
;; clj-fuzzy Public API Tests
;; -------------------------------------------------------------------
;;
;;
;;   Author: PLIQUE Guillaume (Yomguithereal)
;;   Version: 0.1
;;
(ns clj-fuzzy.api-test
  (:require [clojure.test :refer :all]
            [clj-fuzzy.phonetics :as p]
            [clj-fuzzy.metrics :as m]
            [clj-fuzzy.stemmers :as s]))

(deftest phonetics-test
  (is (= "TSKRMNXN" (p/metaphone "discrimination")))
  (is (= "A261" (p/soundex "Ashcroft")))
  (is (= "ANDARSAN" (p/nysiis "Anderson")))
  (is (= "ANRKSN1111" (p/caverphone "Henricsson"))))

(deftest metrics-test
  (is (= 2 (m/levensthein "book" "back")))
  (is (= 0.8 (m/dice "healed" "sealed"))))

(deftest stemmers-test
  (is (= "abil" (s/porter "ability"))))
