(ns org.brinman2002.app.service.SimpleService
  (:import (org.springframework.web.bind.annotation RestController RequestMapping RequestMethod)))

(gen-class
  :name ^{RestController {} 
          RequestMapping {:value ["simple"]} } org.brinman2002.app.service.SimpleService 
  :methods [[^{RequestMapping {:method [RequestMethod/GET]}} greet [] java.lang.String ]
            [^{org.springframework.beans.factory.annotation.Autowired {}} setPlayerRepository [org.brinman2002.app.service.PlayerRepository] void]])



;; TODO move this to a properly managed construct; either ThreadLocal or hung off of state in the form of an atom holding a map
(def repository (atom nil))

(defn -greet
  [_]
  (str "This is a greeting " @repository))

(defn -setPlayerRepository
  [_ repo]
  (swap! repository (fn [_] repo)))

