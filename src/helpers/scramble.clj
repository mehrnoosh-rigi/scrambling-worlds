(ns helpers.scramble)
(require '[clojure.string :as str])

(defn isScramble [str1, str2]
  (println str1, str2)
  (str/includes? str1 str2)
  )
(defn sort-str [s]
  (-> (str (sort s))
      (str/split-lines))
  )

(defn take-input [input]
   (println "Please input the" input "string:")
  (def s (read-line))
  (def sorted-input (sort-str s))
  (println "sorted input", (first(sort-str s)))
  sorted-input)

(def first-str (take-input "first"))
(def second-str (take-input "second"))
(def result (isScramble first-str second-str))
(prn "result" result)

;; (-> sort-str
;;     ;;  (str/split-lines)
;;      str/split-lines
;;     ;;  (sort)
;;      sort
;;     ;;  (str)
;;      (println "here")
;;      str
;;     ;;  #'
;;     ;;  (prn "here")
;;     ;;  (str/join "\\ ")
;;     ;;  (prn "here2")
;;   )
