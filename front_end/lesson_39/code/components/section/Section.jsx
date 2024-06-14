import './style.css'

export default function Section({children, title='undefined'}) {
  return (
    <section className='section'>
      <h5>Section: {title}</h5>
      {/* здесь отобразятся все props children переданные из родителя */}
      {children}
    </section>
  );
}
