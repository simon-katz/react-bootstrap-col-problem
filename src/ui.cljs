(ns ui
  (:require
   ["react-bootstrap/Col"       :default rb-Col]
   ["react-bootstrap/Container" :as rb-Container]
   ["react-bootstrap/Row"       :as rb-Row]
   [reagent.core :as r]
   [reagent.dom :as dom]))

(def Col       (r/adapt-react-class rb-Col))
(def Container (r/adapt-react-class rb-Container))
(def Row       (r/adapt-react-class rb-Row))

(def demo-col-error? false)

(defn ^:dev/after-load render []
  (dom/render (if demo-col-error?
                ;; This gives: Uncaught TypeError: $jscomp.makeIterator is not a function
                [Container
                 [Row
                  [Col "1 of 1"]]]
                ;; No error with this:
                [Container
                 [Row "1"]])
              (js/document.getElementById "app")))
