(ns org.brinman2002.app.service.SimpleService
  (:import (org.springframework.web.bind.annotation RestController RequestMapping RequestMethod)))

(gen-class
  :name ^{RestController {} 
          RequestMapping {:value "simple"} } org.brinman2002.app.service.SimpleService 
  :methods [[^{RequestMapping {:method (into-array RequestMethod #{RequestMethod/GET})}} greet [] java.lang.String ]])

(defn -greet
  [ x]
  "This is a greeting")


