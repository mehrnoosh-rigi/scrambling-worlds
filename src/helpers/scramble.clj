(ns helpers.scramble)
(require '[clojure.string :as str])

(defn isScramble [str1, str2]
  (def r (apply str (distinct (filter (into #{} str1) str2))))
  (.equals str2, r) 
  )

(defn take-input [input]
   (println "Please input the" input "string:")
  (def s (read-line))
  (apply str (sort s)) 
  )

(def first-str (take-input "first"))
(def second-str (take-input "second"))
(def result (isScramble first-str second-str))
(prn "result" result)
