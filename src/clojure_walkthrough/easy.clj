(ns clojure-walthrough.easy)

;; Write a function which returns the last element in a sequence. Don't use the
;; clojure function last!

(let [your-last __]
  (and
    (= (your-last [1 2 3 4 5]) 5)
    (= (your-last '(5 4 3)) 3)
    (= (your-last ["b" "c" "d"]) "d")))

;; Write a function that returns the second to last element of a sequence.

(let [your-second-last __]
  (and
    (= (your-second-last [1 2 3 4 5]) 4)
    (= (your-second-last '(5 4 3)) 4)
    (= (your-second-last ["b" "c" "d"]) "c")))

;; Write a function which returns the sum of a sequence of numbers.

(let [sum-all __]
  (and
    (= (sum-all [1 2 3]) 6))
    (= (sum-all (list 0 -2 5 5)) 8)
    (= (sum-all #{4 2 1}) 7))

;; Write a function which returns only the odd numbers from a sequence.

(let [odd-nums __]
  (and
   (= (odd-nums #{1 2 3 4 5}) '(1 3 5))
   (= (odd-nums [4 2 1 6]) '(1))
   (= (odd-nums [2 2 4 6]) '())))

;; Write a function which returns the first X fibonacci numbers.

(let [fib __]
  (and
   (= (fib 3) '(1 1 2))
   (= (fib 6) '(1 1 2 3 5 8))
   (= (fib 8) '(1 1 2 3 5 8 13 21))))

;; Write a function which removes consecutive duplicates from a sequence.

(let [compress-seq __]
  (and
   (= (apply str (compress-seq "Leeeeeerrroyyy")) "Leroy")
   (= (compress-seq [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
   (= (compress-seq [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))
