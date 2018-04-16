(ns laxam-clojure-tutorial-part3-repl.core
  (:gen-class))

(defn -main
  [& args]
  (loop [_ nil]
    (recur
     (println
      (do (print ">>> ") (flush)
          (try
            (eval
             (let [expr (read *in* false :end)]
               (if (= expr :end) (System/exit 0) expr)))
            (catch Exception e (println "Exception: " (.getMessage e)))))))))
