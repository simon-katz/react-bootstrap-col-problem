(ns ui
  (:require
   ["react-bootstrap/Col"       :as rb-Col]
   ["react-bootstrap/Container" :as rb-Container]
   ["react-bootstrap/Row"       :as rb-Row]
   [reagent.core :as r]
   [reagent.dom :as dom]))

(comment
  [rb-Col rb-Container rb-Row]
  =>
  ;; [#js {:__esModule true, :useCol #object[useCol], :default #js {"$$typeof" #object[Symbol(react.forward_ref)], :render #object[Function]}}
  ;;  #js {"$$typeof" #object[Symbol(react.forward_ref)], :render #object[Function], :defaultProps #js {:fluid false}}
  ;;  #js {"$$typeof" #object[Symbol(react.forward_ref)], :render #object[Function]}]
  )

(def Col       (r/adapt-react-class rb-Col))
(def Container (r/adapt-react-class rb-Container))
(def Row       (r/adapt-react-class rb-Row))

(def demo-col-error? false)

(defn ^:dev/after-load render []
  (dom/render (if demo-col-error?
                ;; This gives "React.createElement: type is invalid -- expected a string"
                [Container
                 [Row
                  [Col "1 of 1"]]]
                ;; No error with this:
                [Container
                 [Row "1"]])
              (js/document.getElementById "app")))
