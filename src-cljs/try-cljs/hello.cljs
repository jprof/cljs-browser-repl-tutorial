(ns try-cljs.hello
  (:require [clojure.browser.repl :as repl]))

(repl/connect "http://localhost:9000/repl")

(js/alert "Hello World!")
