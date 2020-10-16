let Circle = function(radius) {

    this.radius = radius;

    this.getRadius = function() {
        return radius;
    }

    this.getArea = function() {
        return Math.PI * radius * radius;
    }

};

let circle = new Circle(2);

let radius = circle.getRadius();
console.log(radius);
let area = circle.getArea();
console.log(area);
console.log("radius: " + radius + "; area: " + area);