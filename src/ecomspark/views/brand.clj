(ns ecomspark.views.brand
  (:require [hiccup.core :as hi]))

(defn BrandList [{:keys [brands]}]
  (hi/html
    [:div#brands "TODO: LAYOUT & PAGINATION"
     (for [b brands]
       [:div (pr-str b)])]))

(defn SubscribeResult [opts]
  (hi/html [:div "TODO: SUBSCRIBE"]))

(defn UnsubscribeResult [opts]
  (hi/html [:div "TODO: UNSUBSCRIBE"]))
