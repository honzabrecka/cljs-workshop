(ns todolist.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]))

(enable-console-print!)

(defn app
  []
  [:div "cau"])

(defn mount
  []
  #_(re-frame/clear-subscription-cache!)
  (reagent/render [app]
                  (.getElementById js/document "app")))

(defn ^:export run
  []
  #_(re-frame/dispatch-sync [:init])
  (mount))

(defn on-js-reload
  []
  (mount))
