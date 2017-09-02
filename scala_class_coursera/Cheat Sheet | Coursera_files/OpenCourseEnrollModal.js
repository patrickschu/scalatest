define("bundles/certificate-enroll/components/OpenCourseEnrollModal",["require","exports","module","react","bundles/certificate-enroll/components/PhoenixEnrollModal","pages/open-course/common/models/course"],function(require,exports,module){"use strict";function _defaults(e,t){for(var s=Object.getOwnPropertyNames(t),o=0;o<s.length;o++){var r=s[o],n=Object.getOwnPropertyDescriptor(t,r);n&&n.configurable&&void 0===e[r]&&Object.defineProperty(e,r,n)}return e}function _classCallCheck(e,o){if(!(e instanceof o))throw new TypeError("Cannot call a class as a function")}function _possibleConstructorReturn(o,e){if(!o)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!e||"object"!=typeof e&&"function"!=typeof e?o:e}function _inherits(o,e){if("function"!=typeof e&&null!==e)throw new TypeError("Super expression must either be null or a function, not "+typeof e);o.prototype=Object.create(e&&e.prototype,{constructor:{value:o,enumerable:!1,writable:!0,configurable:!0}}),e&&(Object.setPrototypeOf?Object.setPrototypeOf(o,e):_defaults(o,e))}var o,r,e=require("react"),t=require("bundles/certificate-enroll/components/PhoenixEnrollModal"),n=require("pages/open-course/common/models/course"),s=(r=o=function(o){function OpencourseEnrollModal(){return _classCallCheck(this,OpencourseEnrollModal),_possibleConstructorReturn(this,o.apply(this,arguments))}return _inherits(OpencourseEnrollModal,o),OpencourseEnrollModal.prototype.getChildContext=function getChildContext(){var e=this.props.course;return{course:e}},OpencourseEnrollModal.prototype.render=function render(){var o=this.props.isPreEnroll;return e.createElement("div",{className:"rc-OpencourseEnrollModal",id:"OpenCourseEnrollModal"},e.createElement(t,{isPreEnroll:o},this.props.children))},OpencourseEnrollModal}(e.Component),o.propTypes={course:e.PropTypes.instanceOf(n).isRequired,isPreEnroll:e.PropTypes.bool.isRequired,children:e.PropTypes.node.isRequired},o.childContextTypes={course:e.PropTypes.instanceOf(n)},r);module.exports=s});