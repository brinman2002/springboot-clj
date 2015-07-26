(ns org.brinman2002.app.BrandonApplication)

(gen-class 
  :name ^{org.springframework.boot.autoconfigure.SpringBootApplication []} org.brinman2002.app.BrandonApplication
  :main  true)

(defn -main
  [  ]
  (org.springframework.boot.SpringApplication/run (Class/forName "org.brinman2002.app.BrandonApplication") (into-array String '())))
  
  
