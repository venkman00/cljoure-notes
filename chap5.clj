(defn wisdom [words] (str words ", Venky-san"))

(defn year-end-evaluation 
    [] 
    (if (> (rand) 0.5) 
        "You get a raise" 
        "Better luck next year!"))

(defn analyze-file [filename] (analysis (slurp filename)))
(defn analysis [text] (str "Character count: " (count text)))

(def great-baby-name "Rosanthony")
(let [great-baby-name "Bloodthunder"] great-baby-name)

(defn sum ([vals] (sum vals 0))
          ([vals accumulating-total]
            (if (empty? vals)
                accumulating-total
                (sum (rest vals) (+ (first vals) accumulating-total)))))

