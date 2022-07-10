(ns app)
(require '[clojure.string :as str])

;; (js/console.log "Hello, Noosh")

(prn "result" (def sort_str "C\nB\nA"))

(->> sort_str
     (str/split-lines)
     (sort)
     (str/join "\n")
  )
;; (defn sort_str [str]
;;   (print str))

;; (sort_str "drdtdfytfujg")