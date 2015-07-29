(ns org.brinman2002.app.service.SimpleService
  (:import (org.springframework.web.bind.annotation RestController RequestMapping RequestMethod)))

(gen-class
  :name ^{RestController {} 
          RequestMapping {:value ["simple"]} } org.brinman2002.app.service.SimpleService 
  :methods [[^{RequestMapping {:method [RequestMethod/GET]}} greet [] java.lang.String ]
            [^{org.springframework.beans.factory.annotation.Autowired {}} setPlayerRepository [org.brinman2002.app.service.PlayerRepository] void]]
  :state injected
  :init init)

(defn -init 
  []
  [[] (atom {})])

(def repository (atom nil))

(defn -greet
  [this]
  (str "This is a greeting " (:player-repo @(.injected this) )))

(defn -setPlayerRepository
  [this repo]
  (swap! (.injected this) assoc-in [:player-repo] repo))

