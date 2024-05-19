(defn picking-numbers [a]
  (let [frequency (reduce (fn [freq-map n] 
                            (update freq-map n (fnil inc 0))) 
                          {} 
                          a)
        max-count (reduce (fn [max-count [k v]]
                            (let [adj-count (+ v (get frequency (dec k) 0))]
                              (max max-count adj-count)))
                          0 
                          frequency)]
    max-count))

;; Example usage
(def a [4 6 5 3 3 1])
(println (picking-numbers a)) ; Output: 3
