(ns ui
  (:require
   [reagent.dom :as dom]
   ;; These are OK:
   ["react-bootstrap/Card"]
   ["react-bootstrap/Row"]
   ;; This was failing with an error, but OK after adding `:js-options` in
   ;; shadow-cljs.edn
   ["react-bootstrap/Col"]))

(defn ^:dev/after-load render []
  (dom/render [:div "Grrrr!"]
              (js/document.getElementById "app")))
