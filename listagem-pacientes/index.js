const moment = require('moment');
const pacientes = [
    {id: 1, nome: "Maria", dataNascimento: '1984-01-11'},
    {id: 2, nome: "Joao", dataNascimento: '1983-09-16'},
    {id: 3, nome: "Jose", dataNascimento: '1959-07-15'}
];

function buscarPaciente(id){
    return pacientes.find(paciente => paciente.id == id);
}
function calcularIdade(paciente){
    const hoje = moment()
    const dataNascimento = moment(paciente.dataNascimento, 'YYYY-MM-DD');   
    
    return hoje.diff(dataNascimento, 'years')
}

exports.handler = async(event) => {
    console.log('Paciente informado: ' + event.pacienteId)
    
    let pacienteEncontrado;
    
    if (event.pacienteId){
        pacienteEncontrado= buscarPaciente(event.pacienteId);
        pacienteEncontrado.idade = calcularIdade(pacienteEncontrado)
        
        return{
            statusCode: 200,
            body: JSON.stringify(pacienteEncontrado)
        }
    }
    console.log ("DEPLOY CLI!")
    const todosPacientes = pacientes.map(p => ({...p,idade: calcularIdade(p)}))
    
    return{
        statusCoded: 200,
        body: JSON.stringify(todosPacientes)
    }
};

// exports.handler = async (event) => {
//     const { pacienteId } = event;

//     function buscarPaciente(id) {
//     return pacientes.find(paciente => paciente.id == id);
// }

  //  console.log("Paciente informado: " + event.pacienteId);

//    let pacienteEncontrado = pacientes

//    if (event.filtros.pacienteId) 
    //  pacienteEncontrado = buscarPaciente('id', event.filtros.pacienteId)
  //  else if (event.filtros.idade)
//      pacienteEncontrado = buscarPaciente('idade', event.filtros.idade)

//    const response = {
  //      statusCode: 200,
    //    body: JSON.stringify(pacienteEncontrado),
//    };
   // return response;
//};