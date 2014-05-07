(ns clojure-walthrough.elementary)

;; Let's test equality

(= __ true)

;; Clojure arithmetic is similar to Reverse Polish Notation

(= __ (- (* 4 3) 2))

;; Clojure strings are Java Strings, so you can use any Java method on them

(= __ (.toUpperCase "hello world"))

;; Clojure lists can be created using the list function or using the quote operator

(= (list __) '(:a :b :c))

;; For a list, the conj function will return a list with the arguments added in
;; front of the list

(= __ (conj '(2 3 4) 1))

;; Clojure vectors can be created in multiple ways, and they can also be compared
;; with lists

(= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;; For a vector, the conj function will return a vector with the arguments added
;; to the end of the vector

(= __ (conj [1 2 3] 4))

;; Clojure sets are collections of unique values

(= __ (set '(:a :a :b :c :c :c :c :d :d)))

;; For a set, the conj function returns a new set with the arguments added to
;; the set if the key is not already present

(= __ #{1 2 3 4} (conj #{1 4 3}))

;; Clojure maps store key-value pairs. Both maps and keywords can be used as lookup
;; functions. Commas can be used to make maps more readable, but they are not required.

(= __ (:b {:a 10, :b 20, :c 30}) (:b (hash-map :a 10, :b 20, :c 30)))

;; For a map, the conj function returns a new map with one or more key-value pairs added.

(= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))

;; Clojure collections all support sequencing, which means you can use any functions that
;; operate on sequences, such as first and last.

(= __ (first '(3 2 1)))

(= __ (last {:a 10 :b 20 :c 30}))

;; There are many ways to create functions in Clojure.

(= __ ((fn add-five [x] (+ x 5)) 3))

(= __ ((fn [x] (+ x 5)) 3))

(= __ (#(+ % 5) 3))

(= __ ((partial + 5) 3))

;; Write a function that doubles a number

(let [your-fn __]
  (and
    (= (your-fn 2) 4)
    (= (your-fn 0) 0)
    (= (your-fn 7) 14)))

;; The map function takes two arguments: a function (f) and a sequence (s). Map returns a
;; new sequence consisting of the result of applying f to each item of s. Do not confuse
;; the map function with the map data structure.

(= __ (map #(+ % 5) '(1 2 3)))

;; The filter function takes two arguments: a predicate function (f) and a sequence (s).
;; Filter returns a new sequence consisting of all the items of s for which (f item) returns true.

(= __ (filter #(> % 5) '(3 4 5 6 7)))
