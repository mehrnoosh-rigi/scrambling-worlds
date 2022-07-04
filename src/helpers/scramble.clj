(ns helpers.scramble)
(require '[clojure.string :as str])

(defn isScramble [str1, str2]
  (prn str1)
  (prn str2)
  
;;   (str/includes? str1 str2)
  )

(defn take-input [input] 
  (println "Please input the " input " string:")
  (->>
   (read-line)
   #_{:clj-kondo/ignore [:inline-def]}
   (def sort-str)
   )
  )

(def first-str (take-input "first"))
(def second-str (take-input "second"))
(println (str first-str) (str second-str))

(->> sort-str
     (str/split-lines)
     (sort)
     (str/join "\n")
  )