(ns ecomspark.views.brand
  (:require [hiccup.core :as hi]))

(defn Subscribe [id]
  (hi/html
    [:form {:method "post"
            :action "/brand/add"
            :ts-req ""}
     [:input {:type "hidden" :name "id" :value id}]
     [:button.btn.btn-primary "Стежити"]]))

(defn Unsubscribe [id]
  (hi/html
    [:form {:method "post"
            :action "/brand/add"
            :ts-req ""
            :ts-req-method "delete"}
     [:input {:type "hidden" :name "_method" :value "delete"}]
     [:input {:type "hidden" :name "id" :value id}]
     [:button.btn.btn-unsubscribe
      [:svg
       {:width "24",
        :height "24",
        :viewBox "0 0 24 24",
        :fill "none",
        :xmlns "http://www.w3.org/2000/svg"}
       [:path
        {:d "M7.31818 12.0909L10.7273 15.5L16.1818 8",
         :stroke "#32BDA5",
         :stroke-width "1.5",
         :stroke-linecap "round",
         :stroke-linejoin "round"}]]
      [:span "Відстежується"]]]))

(defn Brand [{:keys [id pic name rating stars]} subscribed-brands]
  (let [subscribed? (contains? subscribed-brands id)]
    (hi/html
      [:li.brand {:data-id id :data-subscribed subscribed?}
       [:div.brand-image
        [:img.img-responsive {:src pic}]]
       [:div.brand-content
        [:div.brand-info
         [:h5.brand-name name]
         [:ul.brand-stats
          [:li.brand-stats-stars
           [:span stars]
           [:div.brand-stars-component {:style (str "--rating: " stars ";")}]]
          [:li.brand-stats-rating rating " оцінок"]]]
        [:div.brand-action
         (if subscribed?
           (Unsubscribe id)
           (Subscribe id))]]])))

(defn BrandList [{:keys [brands subscribed-brands]}]
  (hi/html
    [:ul.brands
     (for [b brands]
       (Brand b subscribed-brands))]))
