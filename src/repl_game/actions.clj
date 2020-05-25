
(ns repl-game.actions
  (:use [repl-game.main :only [where-am-i]]))

(defn look-around []
  (keys (ns-publics @where-am-i))
)

;; TODO: make work good
(defn run-to [where]
  (do (in-ns where)
  (reset! where-am-i where)
  ))

