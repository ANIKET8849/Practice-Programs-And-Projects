
console.clear();

gsap.registerPlugin (ScrollTrigger, DrawSVGPlugin, MotionPathPlugin);

gsap.defaults({ease: "none"});

let bodyEl document.body;

function intro(){

///SHIP///

let shipTofish = gsap.timeline();

shipTofish

.set("#lesa", {opacity: 0})

.from('#ship', {x: -100, duration: 2.5}) .from("#top-hill", {x: -40, duration: 2},"<")

// from(bodyE1, (scale: 1:5, transformOrigin: "top", duration: 2.6},"<")

.to("#esa", {opacity: 1 });

let fishingAction = gsap.timeline({defaults: {duration: 1},

scrollTrigger: {

trigger: "#svg",

scrub: true,

start: "top top",

end: "bottom bottom",

// markers: true,

}})

.set("#esa-rope", {drawSVG: 0}, 0)

.from("#esa-rope", {drawSVG: 0}, 0)

.to("#esa", {y: 2020),0);

///SMOKE///
let smoke gsap.timeline({repeat: -1, });

smoke.from(".ship-smoke", {

duration: 2, scale: 0, transformOrigin: "center center", stagger: {each: 0.6},

})

.to(".ship-smoke", {

opacity: 0

});

let moon = gsap.timeline();

moon

.set('.moon-el', {

scale: 0.2,

opacity: 0, transformOrigin: "center center",

})

.from(".moon-main",{ transformOrigin: "center center",

duration: 2,

scale: 0.2,

),0)

.to(".moon-el", {

scale:1, opacity: 1, transformOrigin: "center center", stagger: { }

duration: 2,

each: 0.2

1,0);

///Fishes///

function fishesMove() {

    let x = 0;
    
    let mx = 0;
    
    let xDis= 80;
    
    let topBtm = "top bottom";
    
    let bFishesTop gsap.timeline({scrollTrigger: { = trigger: "#small-fishes-right", start: topBtm}}); let bFishesMid = gsap.timeline({scrollTrigger: { trigger: "#small-fishes-left", start: topBtm}}); let sFishesTop = gsap.timeline({scrollTrigger: { trigger: "#small-fishes-right1, #small-fishes-right2", start: topBtm}});
    
    let sFishesBtm = gsap.timeline({scrollTrigger: { trigger: "#small-fishes-leftl", start: topBtm}});
    
    for (let i = 0; i < 15; i++) { mx -= xDis;
    
    x += xDis;
    
    bFishesTop
    
    .set("#small-fishes-right", {x: -200})
    
    X: X + XDis,
    
    .set('.b-fishes-top', {x: x }) .to('.b-fishes-top', { delay:0.5,
    
    ease: "power3.out",
    
    duration: 1,
    
    stagger: {each: 0.01 }
    
    });



