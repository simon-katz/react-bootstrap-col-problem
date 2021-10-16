(ns ui
  (:require
   [reagent.dom :as dom]
   ;; These are OK:
   ["react-bootstrap/Card"]
   ["react-bootstrap/Row"]
   ["react-bootstrap/Col"]))

(defn ^:dev/after-load render []
  (dom/render [:div "Grrrr!"]
              (js/document.getElementById "app")))
