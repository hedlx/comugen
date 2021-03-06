(ns mug.components.header.component
  (:require [reagent.core :as reagent :refer [atom]]))

(defn header []
  [:div.header
   [:a.header-title {:href "#/"} "μG"]
   [:div.header-navigation
    [:a.header-navigation-item {:href "#/manual"} "Manual"]]])
