(ns adventofcode2020.core
  (:gen-class))

(defn process-file-by-lines
  "Process file reading it line-by-line"
  ([file]
   (process-file-by-lines file identity))
  ([file process-fn]
   (process-file-by-lines file process-fn println))
  ([file process-fn output-fn]
   (with-open [rdr (clojure.java.io/reader file)]
     (doseq [line (line-seq rdr)]
       (output-fn
         (process-fn line))))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (process-file-by-lines "resources/day1.txt"))
