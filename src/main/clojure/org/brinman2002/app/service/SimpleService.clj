(ns org.brinman2002.app.service.SimpleService
  (:import (org.springframework.web.bind.annotation RestController RequestMapping RequestMethod)))

;; Class definition

(gen-class
  :name ^{RestController {} 
          RequestMapping {:value ["simple"]} } org.brinman2002.app.service.SimpleService 
  :methods [[^{RequestMapping {:value ["simple"] :method [RequestMethod/GET]}} greet [] Object ]
            [^{RequestMapping {:value ["simple2"] :method [RequestMethod/GET]}} greet2 [] Object ]
            [^{org.springframework.beans.factory.annotation.Autowired {}} setPlayerRepository [org.brinman2002.app.service.PlayerRepository] void]]
  :state injected
  :init init)

;; Response types

(defrecord Address [^String street ^String city])

(defrecord GreetResponse [^String person 
                          ^String stuff 
                          ^long things 
                          ^Address address])

;; Business logic functions

; TODO

;; Class method implementations
(defn -init 
  "Initialize the class by setting the state to an empty map, which can be populated with injected dependencies."
  []
  [[] (atom {})])

(defn -setPlayerRepository
  "Setter for player repository.  This stores the instance in the state of the object."
  [this repo]
  (swap! (.injected this) assoc-in [:player-repo] repo))

(defn -greet
  "Handler for the /simple/simple resource using defrecord."
  [this]
  (GreetResponse. "A test" "of defrecord" 12345 (Address. "123 fake" "Springfield")))
  ;(str "This is a greeting " (:player-repo @(.injected this) )))

(defn -greet2
  "Handler for the /simple/simple2 resource using maps. This actually doesn't seem to work; it throws an ArityException because Spring seems to treat it as a Callable instead of a JSON-able object."
  [this]
  {:test "This is a test" :of "returning raw maps"})


